import java.io.*;

class Vehicle {
    String reg_no;
    int model;

    void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter reg_no:");
        reg_no = br.readLine();
        System.out.println("Enter model:");
        model = Integer.parseInt(br.readLine());
    }
}

class TwoWheeler extends Vehicle {
    int no_gear, power;

    void read() throws IOException {
        super.read();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no_gear:");
        no_gear = Integer.parseInt(br.readLine());
        System.out.println("Enter power:");
        power = Integer.parseInt(br.readLine());
    }
}

class Scooter extends TwoWheeler {
    String manufacturer, owner;

    void read() throws IOException {
        super.read();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter manufacturer:");
        manufacturer = br.readLine();
        System.out.println("Enter owner:");
        owner = br.readLine();
    }

    void print() {
        System.out.println("\nDetails:");
        System.out.println("Reg_no: " + reg_no);
        System.out.println("Model: " + model);
        System.out.println("No_gear: " + no_gear);
        System.out.println("Power: " + power);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Owner: " + owner);
    }
}

public class Overriding {
    public static void main(String[] args) {
        try {
            Scooter s = new Scooter();
            s.read();
            s.print();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
