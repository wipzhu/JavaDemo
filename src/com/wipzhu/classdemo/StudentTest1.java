package com.wipzhu.classdemo;

public class StudentTest1 {
    public static void main(String[] args) {
    /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。学生的属性:学号，姓名，年龄。
        要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2:添加完毕之后，遍历所有学生信息。
        要求3:通过id删除学生信息,如果存在，则删除，如果不存在，则提示删除失败。
        要求4:删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为"2"的学生，如果存在，则将他的年龄+1岁*/

        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //第3题
        int index = getIndex(arr, 2);
        if (index >= 0) {
            arr[index] = null;
        } else {
            // 当前ID不存在,删除失败
            System.out.println("当前ID不存在,删除失败");
        }
        printArr(arr);
    }

    // 获取ID所在的索引
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (stu.getId() == id) {
                    return i;
                }
            }
        }

        return -1;
    }

    // 打印数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge());
            }
        }
    }

}
