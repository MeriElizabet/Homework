package homework14A;

public class Student {
    public static void main(String[] args) {
        //Project about Student
        PersonalInformation Student1000001 = new PersonalInformation();
        Student1000001.name = "Andrey";
        Student1000001.surname = "Akinov";
        Student1000001.ID = 1000001;
        Student1000001.rating = 3;
        Student1000001.language = "english";
        Student1000001.DigitalImage = 99;
        Student1000001.DigitalSignal = 75;
        Student1000001.KyrgyzHistory = 81;
        Student1000001.WebInformation = 77;
        Student1000001.fee = 800000;
        Student1000001.scholarship = 9000;

        PersonalInformation Student1000002 = new PersonalInformation();
        Student1000002.name = "Alina";
        Student1000002.surname = "Isaeva";
        Student1000002.ID = 1000002;
        Student1000002.rating = 1;
        Student1000002.language = "russian";
        Student1000002.DigitalImage = 98;
        Student1000002.DigitalSignal = 97;
        Student1000002.KyrgyzHistory = 100;
        Student1000002.WebInformation = 88;
        Student1000002.fee = 800000;
        Student1000002.scholarship = 15000;

        PersonalInformation Student1000003 = new PersonalInformation();
        Student1000003.name = "Самат";
        Student1000003.surname = "Килибаев";
        Student1000003.ID = 1000003;
        Student1000003.rating = 2;
        Student1000003.language = "russian";
        Student1000003.DigitalImage = 90;
        Student1000003.DigitalSignal = 96;
        Student1000003.KyrgyzHistory = 98;
        Student1000003.WebInformation = 89;
        Student1000003.fee = 800000;
        Student1000003.scholarship = 15000;

        System.out.println("Персональная информация:");
        System.out.println("Имя - " + Student1000001.name + ", Фамилия - " + Student1000001.surname + ", ID - "
                + Student1000001.ID + ", Язык обучения - " + Student1000001.language + ", Рэйтинг - " + Student1000001.rating);
        System.out.println("Средний балл: " + (Student1000001.DigitalImage + Student1000001.DigitalSignal + Student1000001.KyrgyzHistory + Student1000001.WebInformation) / 4);
        System.out.println("Транзакции:" + " оплата за контракт - " + Student1000001.fee + ", стипендия - " + Student1000001.scholarship );
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("Персональная информация:");
        System.out.println("Имя - " + Student1000002.name + ", Фамилия - " + Student1000002.surname + ", ID - "
                + Student1000002.ID + ", Язык обучения - " + Student1000002.language + ", Рэйтинг - " + Student1000002.rating);
        System.out.println("Средний балл: " + (Student1000002.DigitalImage + Student1000002.DigitalSignal + Student1000002.KyrgyzHistory + Student1000002.WebInformation) / 4);
        System.out.println("Транзакции:" + " оплата за контракт - " + Student1000002.fee + ", стипендия - " + Student1000002.scholarship );
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("Персональная информация:");
        System.out.println("Имя - " + Student1000003.name + ", Фамилия - " + Student1000003.surname + ", ID - "
                + Student1000003.ID + ", Язык обучения - " + Student1000003.language + ", Рэйтинг - " + Student1000003.rating);
        System.out.println("Средний балл: " + (Student1000003.DigitalImage + Student1000003.DigitalSignal + Student1000003.KyrgyzHistory + Student1000003.WebInformation) / 4);
        System.out.println("Транзакции:" + " оплата за контракт - " + Student1000003.fee + ", стипендия - " + Student1000003.scholarship );
        System.out.println("-------------------------------------------------------------------------------");


    }

}
