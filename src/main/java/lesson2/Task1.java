package main.java.lesson2;

    /**
     * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
     * реализовать методы геттеры и сеттеры для каждой переменной.
     * Должны быть выполненны следующие условия:
     *  - не должно быть возможности напрямую устанваливать или читать значение age/name
     *  - нельзя установить значение age меньше нуля
     *  - максимальныое значение для возраста - 100
     *  - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
     *  - name не может состоять из одних только пробелов
     *  - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
     *      оно должно быть записано в переменную name с большой буквы
     *  - ageGroup должен устанавливаться автоматически при установке возраста
     *      - child если age до 15 лет
     *      - student  - если age от 15 до 25 лет
     *      - worker - если age от 26 до 65 лет
     *      - pensioner - если age старше 66 лет
     *  - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
     */

    public class Task1 {
        public static void main(String[] args) {
            Task1 some = new Task1(0,"Lubko","some");
            some.setAge(65);
            some.setName("lubko");
            some.setAgeGroup("");
            System.out.println(some.getAge());
            System.out.println(some.getName());
            System.out.println(some.getAgeGroup());
        }

            private int age;
            private String name;
            String ageGroup;

            public Task1(int age, String name, String ageGroup){
                this.age = age;
                this.name = name;
                this.ageGroup = ageGroup;
            }


            public int getAge () {
                return age;
            }

            public String getName () {
                return name;
            }

            public String getAgeGroup () {
                return ageGroup;
            }

             public void setAge ( int age) {
            if (age <= 0 || age >=100) {
                System.out.println("Age can not be less than 0, or bigger than 100");
                 }
            this.age = age;
             }

            public void setName (String name){
                if (name.length() <= 3 || name.length() >= 50) {
                    System.out.println("Name cannot be less than 3 symbols, or bigger than 50");
                }
                else if (name.trim().length()==0){
                    System.out.println("Name should not consist only of spaces");
                }
                else{
                    name = name.substring(0, 1).toUpperCase() + name.substring(1);
                    this.name = name;
                }

            }

            public void setAgeGroup (String ageGroup) {
                if (age < 15){
                    System.out.println("Child");
                }
                else if (age > 15 && age < 25 ){
                    System.out.println("Student");
                }
                else if (age > 26 && age > 65){
                    System.out.println("Worker");
                }
                else if (age > 66){
                    System.out.println("Pensioner");
                }

            }

        }


