package com.coder.homework;

public class Test {
    public static void main(String[] args) {
        Hr hr = new Hr("人事主管", "李白");
        Coder coder = new Coder("程序员", "杜甫", "写代码BUG", 18000);
        Tester tester = new Tester("测试员", "白居易", "代码bug没测试出来", 12000);
        Art art = new Art("美工", "李商隐", "设计不合理", 7000);
        Account account = new Account("财会", "李清照");
        hr.fire(coder);
        account.pay(coder);
        hr.fire(tester);
        account.pay(tester);
        hr.fire(art);
        account.pay(art);


    }
}

class Account extends Staff {
    public Account(String job, String name) {
        super(job, name);
    }

    public void pay(Staff staff) {
        if (staff instanceof Tester) {
            System.out.println(this.getJob() + this.getName() + "给" + staff.getJob() + staff.getName() +
                    "因为给顾客造成损失，多扣除1000元，最后结算" + (staff.getMoney() - 1000));
        } else {
            System.out.println(this.getJob() + this.getName() + "给" + staff.getJob() + staff.getName() +
                    "结算工资" + staff.getMoney());
        }
    }
}

class Hr extends Staff {
    public Hr(String job, String name) {
        super(job, name);
    }

    public void fire(Staff staff) {
        if (staff instanceof Coder) {
            System.out.println(this.getJob() + this.getName() + "给" + staff.getJob() + staff.getName() +"一次机会"+
                    "原因是:" + staff.getCause());
        } else {
            System.out.println(this.getJob() + this.getName() + "开除" + staff.getJob() + staff.getName() +
                    "原因是:" + staff.getCause());
        }
    }
}

class Coder extends Staff {
    public Coder(String job, String name, String cause, int money) {
        super(job, name, cause, money);
    }
}

class Tester extends Staff {
    public Tester(String job, String name, String cause, int money) {
        super(job, name, cause, money);
    }
}

class Art extends Staff {
    public Art(String job, String name, String cause, int money) {
        super(job, name, cause, money);
    }
}

class Staff {
    private String job;
    private String name;
    private String cause;
    private int money;

    public Staff() {
    }

    public Staff(String job, String name) {
        this.job = job;
        this.name = name;
    }

    public Staff(String job, String name, String cause, int money) {
        this.job = job;
        this.name = name;
        this.cause = cause;
        this.money = money;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}