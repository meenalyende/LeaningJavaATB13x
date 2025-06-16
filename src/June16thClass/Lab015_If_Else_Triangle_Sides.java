package June16thClass;

public class Lab015_If_Else_Triangle_Sides {
    public static void main(String[] args) {
        int side1 = 10;
        int side2 = 10;
        int side3 = 10;

        if (side1 == side2 && side1 == side3) {
            System.out.println("It is an equilateral triangle");
        }
            else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("It is an isosceles triangle");
        }

                else{

                    System.out.println("It is an scalen triangle");
                }

            }
        }


