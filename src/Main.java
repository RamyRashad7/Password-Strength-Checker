import java.util.*;

public class Main {

    public static void checkPasswordStrength (String password) {
        //بنشوف لو الباسورد في حرف كابتل
        boolean thereUpper = false;
        for (int i = 0 ; i < password.length() ; i++) {
            if(Character.isUpperCase(password.charAt(i))){
                thereUpper = true;
                break;
            }
        }
        // بنشوف لو الباسورد في حرف سمال
        boolean thereLower = false;
        for (int i = 0 ; i < password.length() ; i++) {
            if(Character.isLowerCase(password.charAt(i))){
                thereLower = true;
                break;
            }
        }
        // بنشوف لو الباسورد في رقم
        boolean thereNumber = false;
        for (int i = 0 ; i < password.length() ; i++) {
            if(Character.isDigit(password.charAt(i))){
                thereNumber = true;
                break;
            }
        }
        // بنشوف لو الباسورد في رموز
        boolean thereSpecialSymbols = false;
        for (int i = 0 ; i < password.length() ; i++) {
            if (password.charAt(i) >= 33 && password.charAt(i) <= 47
                    || password.charAt(i) >= 58 && password.charAt(i) <= 64
                    || password.charAt(i) >= 91 && password.charAt(i) <= 96
                    || password.charAt(i) >= 123 && password.charAt(i) <= 126) {
                thereSpecialSymbols = true;
                break;
            }
        }

        //هنا بنشيك لو كل المتطلبات انه يبقي باسورد قوي موجوده
        int counterRate = 0 ;
        if (thereUpper){counterRate+=2;}
        if (thereLower){counterRate+=2;}
        if (thereNumber){counterRate+=2;}
        if (thereSpecialSymbols){counterRate+=2;}
        if (password.length()>=8){counterRate+=2;}



        System.out.println("The rate of your password is " + counterRate + "/10");
    }   //دي فانكشن بتشيك علي قوه الباسورد


    public static void lengthGreaterthan8 (String password) {
        if  (password.length() >= 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println("The number of characters in the password is: " + password.length());
    }    //فانكشن بتشوف عدد الحروف و بتطبع عدد الحروف


    public static void containUppercase (String password) {
        for (int i = 0 ; i < password.length() ; i++) {
            boolean thereUpper = false;
            if(Character.isUpperCase(password.charAt(i))){
                thereUpper = true;
                System.out.println("There is a uppercase character");
                System.out.println("The uppercase is : "+password.charAt(i));
            }
        }
    }       //فانكشن بتشوف لو في حرف كابتل و بتطبع


    public static void containLowercase (String password) {
        for (int i = 0; i < password.length(); i++) {
            boolean thereLower = false;
            if (Character.isLowerCase(password.charAt(i))) {
                thereLower = true;
                System.out.println("There is a lowercase character");
                System.out.println("The lowercase is : " + password.charAt(i));
            }

        }
    }      // فانكشن بتشوف لو في حرف سمال و بتطبع


    public static void containNumber (String password) {

        for (int i = 0 ; i < password.length() ; i++) {
            boolean thereNumber = false;
            if(Character.isDigit(password.charAt(i))){
                thereNumber = true;
                System.out.println("There is a number character");
                System.out.println("The number is : "+password.charAt(i));
            }
        }
    }         //فانكشن بتشوف لو في رقم و بتطبع


    public static void containSpecialSymbols (String password) {
        for (int i = 0 ; i < password.length() ; i++) {
            boolean thereSpecialSymbols = false;
            if (password.charAt(i) >= 33 && password.charAt(i) <= 47
                    || password.charAt(i) >= 58 && password.charAt(i) <= 64
                    || password.charAt(i) >= 91 && password.charAt(i) <= 96
                    || password.charAt(i) >= 123 && password.charAt(i) <= 126) {
                thereSpecialSymbols = true;
                System.out.println("There is a special character");
                System.out.println("The special symbols is : "+password.charAt(i));
            }
        }
    }   //فانكشن بتشوف لو في رمز و بتطبعه


    public static void countUppercase (String password) {
        int counterUppercase = 0;
        for (int i = 0 ; i < password.length() ; i++) {
            boolean isUppercase = false;
            if(Character.isUpperCase(password.charAt(i))){
                isUppercase = true;
                counterUppercase++;
            }
        }
        System.out.println("Number of uppercase characters: " + counterUppercase);
    }         //دي فانكشن بتعد الالحروف الكابتل


    public static void countLowercase (String password) {
        int counterLowercase = 0;
        for (int i = 0 ; i < password.length() ; i++) {
            boolean isLowercase = false;
            if(Character.isLowerCase(password.charAt(i))){
                isLowercase = true;
                counterLowercase++;
            }
        }
        System.out.println("Number of lower case characters: " + counterLowercase);
    }       // دي فانكشن بتعد الحروف السمال


    public static void countNumber (String password) {
        int counterNumber = 0;
        for (int i = 0 ; i < password.length() ; i++) {
            boolean isNumber = false;
            if(Character.isDigit(password.charAt(i))){
                isNumber = true;
                counterNumber++;
            }
        }
        System.out.println("Number of numbers: " + counterNumber);
    }           // دي فانكشن بتعد الارقام


    public static void countSpecialSymbols (String password) {
        int counterSpecialSymbols = 0;
        for (int i = 0 ; i < password.length() ; i++) {
            boolean isSpecialSymbol = false;
            if (password.charAt(i) >= 33 && password.charAt(i) <= 47
                    || password.charAt(i) >= 58 && password.charAt(i) <= 64
                    || password.charAt(i) >= 91 && password.charAt(i) <= 96
                    || password.charAt(i) >= 123 && password.charAt(i) <= 126) {
                isSpecialSymbol = true;
                counterSpecialSymbols++;
            }
        }
        System.out.println("Number of special symbols: " + counterSpecialSymbols);
    }       // دي فانكشن بتعد الحروف المميزه


    //=================================================
    // دي فانكشن بتعمل باسورد من حروف كابتل فقط
    public static String generateUpper(int length) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(upper.length());
            result += upper.charAt(index);
        }

        return result;
    }


    // دي فانكشن بتعمل باسورد من حروف سمال فقط
    public static String generateLower(int length) {
        String lower = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(lower.length());
            result += lower.charAt(index);
        }

        return result;
    }


    // دي فانكشن بتعمل باسورد من أرقام فقط
    public static String generateNumbers(int length) {
        String numbers = "0123456789";
        Random rand = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(numbers.length());
            result += numbers.charAt(index);
        }

        return result;
    }


    // دي فانكشن بتعمل باسورد من رموز فقط
    public static String generateSymbols(int length) {
        String symbols = "!@#$%^&*()-_=+[]{};:,.<>/?";
        Random rand = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(symbols.length());
            result += symbols.charAt(index);
        }

        return result;
    }


    public static String generatePassword(int length) {

        //  فرض الحد الأدنى 8
        if (length < 8) {
            length = 8;
        }

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()-_=+[]{};:,.<>/?";

        Random rand = new Random();
        String result = "";

        result += upper.charAt(rand.nextInt(upper.length()));
        result += lower.charAt(rand.nextInt(lower.length()));
        result += numbers.charAt(rand.nextInt(numbers.length()));
        result += symbols.charAt(rand.nextInt(symbols.length()));

        String all = upper + lower + numbers + symbols;

        for (int i = 4; i < length; i++) {
            result += all.charAt(rand.nextInt(all.length()));
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  فرضت شرط إن الباسورد لا يقل عن 8 حروف
        String password;
        do {
            System.out.print("Enter your password to check its strength (minimum 8 characters): ");
            password = sc.nextLine();

            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters!");
            }

        } while (password.length() < 8);

        checkPasswordStrength(password);

        String stop = "";
        String operation  = "";
        boolean stopOperatin = true;

        do {
            System.out.println("If you want to know the password length press \"G\"");
            System.out.println("==================================================================");
            System.out.println("If you want to if there an uppercase press \"U\"");
            System.out.println("==================================================================");
            System.out.println("If you want to if there an lowercase press \"L\"");
            System.out.println("==================================================================");
            System.out.println("If you want to if there an number press \"N\"");
            System.out.println("==================================================================");
            System.out.println("If you want to if there an specialsymbols press \"S\"");
            System.out.println("==================================================================");
            System.out.println("If you want to the count of uppercase press \"CU\"");
            System.out.println("==================================================================");
            System.out.println("If you want to the count of lowercase press \"CL\"");
            System.out.println("==================================================================");
            System.out.println("If you want to the count of number press \"CN\"");
            System.out.println("==================================================================");
            System.out.println("If you want to the count of specialsymbols press \"CS\"");
            System.out.println("==================================================================");
            System.out.println("If you want to generate uppercase password press \"GU\"");
            System.out.println("==================================================================");
            System.out.println("If you want to generate lowercase password press \"GL\"");
            System.out.println("==================================================================");
            System.out.println("If you want to generate numbers password press \"GN\"");
            System.out.println("==================================================================");
            System.out.println("If you want to generate symbols password press \"GS\"");
            System.out.println("==================================================================");
            System.out.println("If you want to generate strong password press \"GP\"");
            System.out.println();

            System.out.print("Press the key you want to do it operation : ");


            operation = sc.nextLine();

            int genLength;


            if (operation.equals("G")) {
                lengthGreaterthan8(password);
            }
            else if (operation.equals("U")) {
                containUppercase(password);
            }
            else if (operation.equals("L")) {
                containLowercase(password);
            }
            else if (operation.equals("N")) {
                containNumber(password);
            }
            else if (operation.equals("S")) {
                containSpecialSymbols(password);
            }
            else if (operation.equals("CU")) {
                countUppercase(password);
            }
            else if (operation.equals("CL")) {
                countLowercase(password);
            }
            else if (operation.equals("CN")) {
                countNumber(password);
            }
            else if (operation.equals("CS")) {
                countSpecialSymbols(password);
            }
            else if (operation.equals("GU")) {
                System.out.print("Enter length: ");
                genLength = sc.nextInt();
                sc.nextLine();
                System.out.println("Generated Uppercase Password: " + generateUpper(genLength));
            }
            else if (operation.equals("GL")) {
                System.out.print("Enter length: ");
                genLength = sc.nextInt();
                sc.nextLine();
                System.out.println("Generated Lowercase Password: " + generateLower(genLength));
            }
            else if (operation.equals("GN")) {
                System.out.print("Enter length: ");
                genLength = sc.nextInt();
                sc.nextLine();
                System.out.println("Generated Numbers Password: " + generateNumbers(genLength));
            }
            else if (operation.equals("GS")) {
                System.out.print("Enter length: ");
                genLength = sc.nextInt();
                sc.nextLine();
                System.out.println("Generated Symbols Password: " + generateSymbols(genLength));
            }
            else if (operation.equals("GP")) {
                System.out.print("Enter length: ");
                genLength = sc.nextInt();
                sc.nextLine();
                System.out.println("Strong Generated Password: " + generatePassword(genLength));
            }
            else {
                System.out.println("Invalid choice!");
            }

            System.out.print("Do you want another operation? (Y / N): ");
            stop = sc.nextLine();

            if (stop.equalsIgnoreCase("Y")) {
                stopOperatin = true;
            }else {
                stopOperatin = false;
            }

        }while (stopOperatin == true);

    }
}