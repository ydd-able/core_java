package com.coder.homework;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

/**
 * @author N1357
 * @date 2026/3/25
 * @project core_java
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Users user = Login.login();
        if (user == null) {
            System.out.println("系统登陆失败");
        } else {
            //从配置文件中获取学生对象的属性，将其进行序列化。
            Student student = new Student();
            student.setName(getInfo("student.name"));
            student.setGender(getInfo("student.gender"));
            student.setAge(Integer.parseInt(getInfo("student.age")));
            serialize(student);
            //从配置文件中获取教师对象的属性，将其存储到磁盘文件上。
            Teacher teacher = new Teacher(getInfo("teacher.name"),getInfo("teacher.gender"),Integer.parseInt(getInfo("teacher.age")));
            saveTeacherInfo(teacher);
            log(user);




        }
    }

    public static String getInfo(String key) {
        ResourceBundle bundle = ResourceBundle.getBundle("com.coder.homework.info");
        return bundle.getString(key);
    }
    public static void serialize(Student student) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/student"));
        oos.writeObject(student);
        oos.close();
    }
    public static void saveTeacherInfo(Teacher teacher) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("d:/teacher"));
        dos.writeUTF(teacher.getName());
        dos.writeInt(teacher.getAge());
        dos.close();
    }
    public static void log(Users user) throws IOException {
        File file = new File("d:/teacher");
        file.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("操作人:"+user.getName());
        bw.newLine();;
        bw.write("系统时间:"+ LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        bw.newLine();
        File file1 = new File("d:/student");
        File file2 = new File("d:/teacher");
        bw.write(file1.getName()+",文件大小"+file1.length());
        bw.newLine();
        bw.write(file1.getName()+",文件大小"+file2.length());
    }
}
