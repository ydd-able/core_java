package com.coder.homework;

public class LibAdmin {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void check(Student student){
        BookCard card = student.getCard();
        if("红色".equals(card.getColor()))
        {
            if("A".equals(card.getType())){
                System.out.println(student.getName()+"可以借到《Java基础》");
            }else if ("B".equals(card.getType())){
                System.out.println(student.getName()+"可以借到《mysql数据库》");
            }else{
                System.out.println(student.getName()+"可以借到《Java编程思想》");
            }

        }else {
            System.out.println(student.getName()+"可以借到《Java编程思想》");
        }



    }
}
