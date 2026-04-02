package com.coder.reen;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author N1357
 * @date 2026/4/1
 * @project core_java
 */
public class TestPoolApi {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
      /*  testSubmit(service);
        service.shutdown();*/
      /*  testInvokeAll(service);
        service.shutdown();*/
        testInvokeAny(service);
    }
   // 扔一批任务给线程池，只要有任意一个任务正常执行成功，立刻返回它的结果；剩下所有没跑完 / 没开始的任务，全部自动取消。
    public static void testInvokeAny(ExecutorService service) throws ExecutionException, InterruptedException {
        Integer x = service.invokeAny(Arrays.asList(()->{
            System.out.println("任务1");
            TimeUnit.MILLISECONDS.sleep(300);
            return 10;
        },()->{
            System.out.println("任务2");
            TimeUnit.MILLISECONDS.sleep(300);
            return 20;
            },()->{
            System.out.println("任务3");
            TimeUnit.MILLISECONDS.sleep(300);
            return 30;
        }));
        System.out.println(x);
        service.shutdown();
    }
    //一批任务全部老老实实跑完，所有结果统一打包返回，一个都不能少。
    public static void testInvokeAll(ExecutorService service) throws InterruptedException {
        List<Callable<String>> list = Arrays.asList(
                ()->{
                    System.out.println("任务1");
                    TimeUnit.MILLISECONDS.sleep(300);
                    return "aa";
                },
                ()->{
                    System.out.println("任务2");
                    TimeUnit.MILLISECONDS.sleep(300);
                    return "bb";
                },
                ()->{
                    System.out.println("任务3");
                    TimeUnit.MILLISECONDS.sleep(300);
                    return "cc";
                });
        List<Future<String>> futures = service.invokeAll(list);//把三个任务全部提交给线程池。
        futures.forEach(future->{
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

    }
    public static void testSubmit(ExecutorService service)  {
       /* Future<Integer> f = service.submit(() -> {
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            return sum;
        });
        try {
            System.out.println(f.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }*/

        service.submit(()->{
            System.out.println("执行任务");
        });
    }

}
