import java.util.Scanner;
//import static java.lang.Math.abs;

/**
 * @author ShashankVRay
 *  *           One of my DRY projects.
 *  *           <DO NOT REPEAT YOURSELF>
 *  * This is a simple project created during the Java Training period at PROFINCH SOLUTIONS PRIVATE LIMITED on 06/02/2020
 */

public class Task1 {
    public static double totBill = 0;
    public static double hatch = 535000;
    public static double saloon = 495000;
    public static double estate = 625000;
    public static Boolean lux1 = true, lux2 = true, lux3 = true, lux4 = true, lux5 = true, isFreeService = false;
    public static int ch = 0;

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Are you an existing customer?\n1.Yes\n2.No\n");
            int exis = in.nextInt();
            Boolean haveCar = false;
            int myCar = 0, myCars = 0;
            System.out.println("Do you've a car to trade in?\n1.Yes\n2.No\n");
            switch (exis) {
                case 1:
                    int temp;
                    temp = in.nextInt();
                    if (temp == 1) haveCar = true;
                    if (haveCar) {
                        System.out.println("[ADMIN] \nDiscount of an amount within Rs.10,000 and Rs. 100,000 that is to be applied is: ");
                        double discount = in.nextDouble();
                        totBill -= discount;
                    }
                    System.out.print("Which is the model you'd like to buy?\n1.Hatchback\n2.Saloon\n3.Estate\n");
                    myCar = in.nextInt();
                    if (myCar == 1) totBill = (0.9 * hatch);
                    if (myCar == 2) totBill = (0.9 * saloon);
                    if (myCar == 3) totBill = (0.9 * estate);
                    if (!haveCar) totBill = (0.95 * totBill);
                    break;
                case 2:
                    int tempp = in.nextInt();
                    if (tempp == 1) haveCar = true;
                    if (haveCar) {
                        System.out.println("[ADMIN PRIVILEGES ] \nDiscount of an amount within Rs.10,000 and Rs. 100,000 that is to be applied is: ");
                        double discount = in.nextDouble();
                        totBill -= discount;
                    }
                    System.out.println("Which is the model you'd like to buy?\n1.Hatchback\n2.Saloon\n3.Estate\n");
                    myCars = in.nextInt();
                    if (myCars == 1) totBill = hatch;
                    if (myCars == 2) totBill = saloon;
                    if (myCars == 3) totBill = estate;
                    if (!haveCar) totBill = (0.95 * totBill);
                    break;
                default:
                    System.out.println("Enter valid choice: (1) or (2) only\n");
            }
            System.out.println("Before luxuries: " + totBill);
            Luxuries(1, lux1, lux2, lux3, lux4, lux5);
            System.out.println("After luxuries: " + totBill);
            System.gc();

            System.out.println("\n\n-------------PAYMENTS-------------\n");
            System.out.println("What modes of payments are you willing to make with?\n1. One Shot Payment\n2.Equal Monthly Installments\n");
            int pay = in.nextInt();
            double sadyakke = 0;
            switch (pay) {
                case 1:
                    System.out.println("Would you prefer to get a 1% discount or choose any one extra luxury for free?\n" +
                                       "1.Get 1% discount\n2.Choose any one luxury for free\n");
                    int opt = in.nextInt();
                    if (opt == 1)
                        totBill = (0.99 * totBill);
                    else if (opt == 2) {
                        Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                    } else
                        System.out.println("Enter valid choice\n(1) or (2) choices only");
                    break;
                case 2:
                    System.out.println("Within how many months will you be making the payment?\nNote: The EMI has to "
                            + "be re-payed within 7 years (12x7 = 84 months)");
                    int months = in.nextInt();
                    if(months < 49){
                        months -= 48;
                        System.out.println("EMI amount to be payed per month is: " + (totBill/months));
                    }
                    if (months < 85) {
                        sadyakke = totBill;
                        for (int i = 0; i < months; i++) {
                            totBill += (0.05 * totBill);
                        }
                    }
                    else
                        System.out.println("EMI options are available only for 7 years (84 months)");
                    break;
                default:
                    System.out.println("Enter valid choice");
            }

            //TODO - Finish printing the bill about every individual payment so accumulated
            System.out.println("\n\n\nAll BILL DETAILS are now supposed to be displayed here but I'm lazy to type print statements :P\n\n");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Details about every items:");
            System.out.println("Cost of the model selected: " + (myCar == 1 || myCars == 1? ("Hatchback = Rs.5.35 lakh"):
                        (myCar == 2 || myCars == 2 ? "Saloon = Rs.4.95 lakh":myCar ==3 || myCars == 3? "Estate = Rs. 6.25 lakh" : "Car model not specified yet!")));
            //System.out.println("EMI (if opted) amount to be paid: Rs." + abs(totBill - sadyakke));
            System.out.println("\nTOTAL AMT: Rs." + totBill);
            System.out.println("----------------------------------------------------------------------------------\n");
            //total amt   //amt of all things  //number of payments in emi  //cash back so gained
    }
        public static void Luxuries(int callingMethod, Boolean lux1, Boolean lux2, Boolean lux3, Boolean lux4, Boolean lux5) {
            Scanner in = new Scanner(System.in);
            if(!isFreeService) {
                System.out.println("Do you need any optional feature? Select the features thereafter(if required).\n1.Yes\n2.No\n");
                ch = in.nextInt();
                if (ch == 1) {
                    System.out.println("Luxuries we offer:\n-------------------------------");
                    System.out.printf("%-27s-- %-11s\n%-27s-- %-11s\n%-27s-- %-11s\n%-27s-- %-11s\n%-27s-- %-11s\n", "1. Luxury Seats", "Rs. 45,000",
                            "2. Satellite Navigation", "Rs. 5,500", "3. Parking Sensors:", "Rs. 10,000", "4. Bluetooth Connectivity", "Rs. 350", "5. Sound System", "Rs. 1,000");
                    int lux = in.nextInt();
                    int whoknows;
                    switch (lux) {
                        case 1:
                            if (lux1) {
                                lux1 = false;
                                if (callingMethod == 1) {
                                    totBill += 45000;
                                    Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                                    break;
                                } else {
                                    Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                                }
                            } else {
                                System.out.println("You've already chosen this optional feature.\nPlease select an option other than this");
                                if (callingMethod == 1)
                                    Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                                else {
                                    lux1 = false;
                                    Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                                }
                            }
                            break;
                        case 2:
                            if (lux2) {
                                lux2 = false;
                                if (callingMethod == 1) {
                                    totBill += 5500;
                                    Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                                    break;
                                } else {
                                    Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                                }
                            } else {
                                System.out.println("You've already chosen this optional feature.\nPlease select an option other than this");
                                if (callingMethod == 1)
                                    Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                                else {
                                    lux2 = false;
                                    Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                                }
                            }
                            break;
                        case 3:
                            if (lux3) {
                                lux3 = false;
                                if (callingMethod == 1) {
                                    totBill += 10000;
                                    Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                                    break;
                                } else {
                                    Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                                }
                            } else {
                                System.out.println("You've already chosen this optional feature.\nPlease select an option other than this");
                                if (callingMethod == 1)
                                    Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                                else {
                                    lux3 = false;
                                    Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                                }
                            }
                            break;
                        case 4:
                            if (lux4) {
                                lux4 = false;
                                if (callingMethod == 1) {
                                    totBill += 350;
                                    Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                                    break;
                                } else {
                                    Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                                }
                            } else {
                                System.out.println("You've already chosen this optional feature.\nPlease select an option other than this");
                                if (callingMethod == 1)
                                    Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                                else {
                                    lux4 = false;
                                    Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                                }
                            }
                            break;
                        case 5:
                            if (lux5) {
                                lux5 = false;
                                if (callingMethod == 1) {
                                    totBill += 1000;
                                    Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                                    break;
                                } else {
                                    Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                                }
                            } else {
                                System.out.println("You've already chosen this optional feature.\nPlease select an option other than this");
                                if (callingMethod == 1)
                                    Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                                else {
                                    lux5 = false;
                                    Luxuries(2, lux1, lux2, lux3, lux4, lux5);
                                }
                            }
                            break;
                        default:
                            System.out.println("Enter a valid entry");
                            System.out.println("Any (other) luxuries required?\n\n1.Yes\n2.No\n");
                            whoknows = in.nextInt();
                            if (whoknows == 1)
                                Luxuries(1, lux1, lux2, lux3, lux4, lux5);
                    }
                }
            }
            else {
                System.out.println("You have selected one optional feature for free. Thank you.");
            }
        }
    }
