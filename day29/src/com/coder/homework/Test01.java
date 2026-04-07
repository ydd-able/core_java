package com.coder.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ResourceBundle;

/**
 * @author N1357
 * @date 2026/4/7
 * @project core_java
 */
public class Test01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("config");
        String className = bundle.getString("class.name");
        String propertyNames = bundle.getString("property.names");
        String propertyTypes = bundle.getString("property.types");

        int lastDot = className.lastIndexOf(".");
        String packageName = className.substring(0,lastDot);
        String simpleClassName = className.substring(lastDot+1);


        String[] names = propertyNames.split(",");
        String[] types = propertyTypes.split(",");

        StringBuilder s1 = new StringBuilder();
        s1.append("package ").append(packageName).append(";\n\n");

        s1.append("public class ").append(simpleClassName).append("{\n\n");

        for (int i = 0; i < names.length; i++) {
            s1.append("   private ").append(types[i]).append(" ").append(names[i]).append(";\n");
        }
        s1.append("\n");

        s1.append("    public ").append(simpleClassName).append("() {}\n\n");
        s1.append("    public ").append(simpleClassName).append("(");
// 拼接参数列表
        for (int i = 0; i < names.length; i++) {
            if (i > 0) s1.append(", ");
            s1.append(types[i]).append(" ").append(names[i]);
        }
        s1.append(") {\n");

// 赋值 this.xxx = xxx
        for (int i = 0; i < names.length; i++) {
            s1.append("        this.").append(names[i]).append(" = ").append(names[i]).append(";\n");
        }
        s1.append("    }\n\n");

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            String type = types[i];
            String capitalize = Character.toUpperCase(name.charAt(0)) + name.substring(1);

            // getter
            s1.append("    public ").append(type).append(" get").append(capitalize).append("() {\n");
            s1.append("        return ").append(name).append(";\n");
            s1.append("    }\n\n");

            // setter
            s1.append("    public void set").append(capitalize).append("(").append(type).append(" ").append(name).append(") {\n");
            s1.append("        this.").append(name).append(" = ").append(name).append(";\n");
            s1.append("    }\n\n");
        }


        s1.append("    @Override\n");
        s1.append("    public String toString() {\n");
        s1.append("        return \"").append(className).append("{\" +\n");
        for (int i = 0; i < names.length; i++) {
            if (i == 0) {
                s1.append("                \"").append(names[i]).append("=\" + ").append(names[i]).append(" +\n");
            } else {
                s1.append("                \", ").append(names[i]).append("=\" + ").append(names[i]).append(" +\n");
            }
        }
        s1.append("                \"}\";\n");
        s1.append("    }\n");

        s1.append("}");


        String base = System.getProperty("user.dir");
        base +="/day29/src/";
        packageName = packageName.replace(".","/");
        base+=packageName;
        File dir = new File(base);
        dir.mkdirs();




        File javaFile = new File(dir, simpleClassName+".java");
        try (FileOutputStream fos = new FileOutputStream(javaFile)) {
            fos.write(s1.toString().getBytes());
            System.out.println("生成成功：" + javaFile.getAbsolutePath());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
