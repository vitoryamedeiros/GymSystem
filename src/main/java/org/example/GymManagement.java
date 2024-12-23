package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GymManagement {
    private List<Member> members = new ArrayList<>();
    private int nextId = 1;

    //create a new member
    public void createMember(String name, String email, int age) {
        Member member = new Member(nextId++, age, name, email);
        members.add(member);
        System.out.println("Member created sucessfully " + member.getName());
    }

    //read all members
    public void listMembers() {
        if (members.isEmpty()){
            System.out.println("No members found");
            return;
        }
        System.out.println("Members:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    //update a member
    public void updateMember(int id, String name, String email, int age) {
        for (Member member : members) {
            if (member.getId() == id) {
                member.setName(name);
                member.setEmail(email);
                member.setAge(age);
                System.out.println("Member updated sucessfully " + member);
                return;
            }
        }
        System.out.println("Member not found with id " + id);
    }

    //delete a member
    public void deleteMember(int id) {
        members.removeIf(member -> member.getId() == id);
        System.out.println("Member deleted sucessfully.");
    }


}
