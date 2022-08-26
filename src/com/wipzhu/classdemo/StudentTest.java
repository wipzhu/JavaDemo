package com.wipzhu.classdemo;

public class StudentTest {
    public static void main(String[] args) {
    /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。学生的属性:学号，姓名，年龄。
        要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2:添加完毕之后，遍历所有学生信息。
        要求3:通过id删除学生信息,如果存在，则删除，如果不存在，则提示删除失败。
        要求4:删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为"heimae02”的学生，如果存在，则将他的年龄+1岁*/

        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        // 第1题
        Student stu4 = new Student(4,  "zhaoliu", 26);

        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //  已经存在
            System.out.println("当前ID重复，请修改ID后重试");
        } else {
            int count = getCount(arr);
            if (count == arr.length) {
                // 已经存满
                // 创建一个新数组，将旧数组的元素从朋友到新数组

            } else {
                // 没有存满
                arr[count] = stu4;
            }

        }
    }

    public static void createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length];


    }

    // 获取数组存的元素数量
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    // 判断数组是否包含ID
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            int stId = stu.getId();
            if (id == stId) {
                return true;
            }
        }
        return false;
    }

}
