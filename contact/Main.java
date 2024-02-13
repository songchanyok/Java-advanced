package com.test.contact;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.println("메뉴를 선택해주세요: ↵");
            menu = scanner.nextInt();
            scanner.nextLine();
            if(menu == 1){
                System.out.println("이름을 입력하세요: ↵");
                String name = scanner.nextLine();
                System.out.println("전화번호를 입력하세요: ↵");
                String phonenum = scanner.nextLine();
                System.out.println("회사명을 입력하세요: ↵");
                String companyName = scanner.nextLine();
                contacts.add(new BusinessContact(name,phonenum,companyName));
            }
            if(menu == 2){
                System.out.println("이름을 입력하세요: ↵");
                String name = scanner.nextLine();
                System.out.println("전화번호를 입력하세요: ↵");
                String phonenum = scanner.nextLine();
                System.out.println("관계를 입력하세요: ↵");
                String rel = scanner.nextLine();
                contacts.add(new PersonalContact(name,phonenum,rel));
            }
            if(menu == 3){
                if(contacts.size()==0){
                    System.out.println("연락처가 비어있습니다.");
                }
                for(Contact contact : contacts){
//                    if(contact instanceof BusinessContact){
//                        contact.print();
//                    }
                    contact.displayContacts();
                }

            }
            if(menu==4){
                System.out.println("검색할 이름을 입력하세요: ↵");
                String name = scanner.next();
                byte check=0;
                for(Contact contact: contacts){
                    if(contact.name.contains(name)){
                        contact.displayContacts();
                        check++;
                    }
                }
                if(check==0){
                    System.out.println("연락처를 찾을 수 없습니다.");
                }
            }
        }while(menu != 5);
    }
}
