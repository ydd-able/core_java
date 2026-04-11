package com.coder.supermarket;

import java.io.*;
import java.util.List;

/**
 * @author N1357
 * @since 2026/4/11
 */
public class DataUtil {

        private static final String PATH = "data.obj";

        public static void save(List<Cashier> cashiers, List<Product> products,
                                List<ProductType> types, List<Order> orders, List<Log> logs){
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
                oos.writeObject(cashiers);
                oos.writeObject(products);
                oos.writeObject(types);
                oos.writeObject(orders);
                oos.writeObject(logs);
            }catch (Exception e){e.printStackTrace();}
        }

        public static Object[] load(){
            File f = new File(PATH);
            if(!f.exists()) return new Object[5];
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
                return new Object[]{ois.readObject(),ois.readObject(),ois.readObject(),ois.readObject(),ois.readObject()};
            }catch (Exception e){e.printStackTrace();}
            return new Object[5];
        }
    }

