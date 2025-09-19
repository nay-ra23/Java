 public class AreaOfCircle {
   public static void main(String[] args) {
         System.out.println("Area of circle: ");
        float f= 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float radius= sc.nextInt();
        float area = f*radius*radius;
        System.out.println("Area of circle is: "+area);
    }
}