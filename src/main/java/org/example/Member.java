package org.example;

public class Member {
        private int id;
        private int age;
        private String name;
        private String email;

        public Member (int id, int age, String name, String email){
            this.id = id;
            this.age = age;
            this.name = name;
            this.email = email;
        }

        //get and setter ID
        public int getId(){
            return id;
        }
        public void setId (int id){
            this.id = id;
        }

        //get and setter age
        public int getAge(){
            return age;
        }
        public void setAge (int age){
            this.age = age;
        }

        //get and setter name
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        //get and setter email
        public String getEmail(){
            return email;
        }

        public void setEmail(String email){
            this.email = email;
        }

        @Override
    public String toString(){
            return "Member{" +
                    "id=" + id +
                    ", name= '" + name + '\'' +
                    ", email= '" + email + '\'' +
                    "age=" + age +
                    '}';
        }
    }