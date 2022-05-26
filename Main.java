import java.util.Scanner;

public class Main{

    public static double splenderPlus(double splenderPlusAmt, double intrestOnSplender, double dpAmt){
        double mainAmt = splenderPlusAmt-dpAmt;
        System.out.println("Amout left is "+mainAmt+" from your DP AMount");
        System.out.println("Bank will Charge 11% of Intrest in your Left Amount to Finnance");
        double intrestAmtonSplender = mainAmt*intrestOnSplender/100;
        double totalAmtonSplender = mainAmt+intrestAmtonSplender;
        return totalAmtonSplender;
    }

    public static double superSplender(double superSplnderAmt, double intrestonSuper, double dpAmtonSuper){
        double mainAmt = superSplnderAmt-dpAmtonSuper;
        System.out.println("Amount is left "+mainAmt+" from you DP Amount");
        System.out.println("Bank will charge 12% cof Intrest on Super Splender Bike..");
        double intresAmtonSuper = mainAmt*intrestonSuper/100;
        double totalAmtonSuper = mainAmt+intresAmtonSuper;
        return totalAmtonSuper;
    }

    public static double glammerBike(double glammerAmt, double intrestonGlammer, double dpAmtonGlammer){
        double mainAmtGalmmer = glammerAmt-dpAmtonGlammer;
        System.out.println("Amount is left "+mainAmtGalmmer+" from your DP Amount..");
        System.out.println("Bank will charge 13% of Intrest on  your Left Amount..");
        double intrestAmtonGlammer = glammerAmt*intrestonGlammer/100;
        double totalAmtonGlammer = mainAmtGalmmer+intrestAmtonGlammer;
        return totalAmtonGlammer;
    }

    public static double passionBike(double passionAmt, double intrestonPassion, double dpAmtonPassion){
        double mainAmtonPassion = passionAmt-dpAmtonPassion;
        System.out.println("Your Amount is left "+mainAmtonPassion+" from your DP Amount..");
        double intrestAmtonPassion = mainAmtonPassion*intrestonPassion/100;
        double totalAmtonPassion = mainAmtonPassion+intrestAmtonPassion;
        return totalAmtonPassion;
    }

    public static double shineBike(double hondaShineAmt, double intrestonShine, double dpAmtShine){
        double mainAmtShine = hondaShineAmt-dpAmtShine;
        System.out.println("Your Amount is left "+mainAmtShine+" from your DP Amount");
            double intrestAmtonShine = mainAmtShine*intrestonShine/100;
            double totalAmtOnShine = mainAmtShine+intrestAmtonShine;
            return totalAmtOnShine;
    }

    public static double livoBike(double hondaLivoAmt, double intrestonLivo, double dpAmtonLivo){
        double mainAmtLivo = hondaLivoAmt-dpAmtonLivo;
        System.out.println("Your Anount is left "+mainAmtLivo+" from your Dp Amount..");
        double inrestAmtonLivo = mainAmtLivo*intrestonLivo/100;
        double totalAmtonLivo = mainAmtLivo+inrestAmtonLivo;
        return totalAmtonLivo;
    }
    public static double yugaBike(double dreamYugaAmt,double intrestOnYuga, double dpAmtYuga){
        double mainAmtYuga = dreamYugaAmt-dpAmtYuga;
        System.out.println("Your Amount is left "+mainAmtYuga+" from your DP Amount");
        double intrestAmtonYuga = mainAmtYuga*intrestOnYuga/100;
        double totalAmtYuga = mainAmtYuga+intrestAmtonYuga;
        return totalAmtYuga;
    }
    public static double activaScooter(double activaAmt,double intrestonActiva,double dpAmtonActiva){
        double mainAmtActiva = activaAmt-dpAmtonActiva;
        System.out.println("Your Amount is Left "+mainAmtActiva+" from your DP Amount...");
        double intrestAmtonActiva = mainAmtActiva*intrestonActiva/100;
        double totalAmtActiva = mainAmtActiva+intrestAmtonActiva;
        return totalAmtActiva;
    }
    public static double bajajPulsar(double pulsarAmt,double intrestOnPulsar,double dpAmtonPlusar){
        double mainAmtPulsar = pulsarAmt-dpAmtonPlusar;
        System.out.println("Your Amount is Left "+mainAmtPulsar+"from your DP Amount..");
        double intrestAmtPulsar = mainAmtPulsar*intrestOnPulsar/100;
        double totalAmtPulsar = mainAmtPulsar+intrestAmtPulsar;
        return totalAmtPulsar;
    }
    public static double bajajCT(double Ct100Amt, double intrestonCT100,double dpAmtCT100){
        double mainAmtCT = Ct100Amt-dpAmtCT100;
        System.out.println("Your amount is left "+mainAmtCT+" from your DP Amount");
        double intrestAmtonCT100 = mainAmtCT*intrestonCT100/100;
        double totalAmtCT100 = mainAmtCT+intrestAmtonCT100;
        return totalAmtCT100; 
    }
    public static double bajajDominar(double dominarAmt,double intrestonDominar,double dpAmtDominar){
        double mainAmtDominar = dominarAmt-dpAmtDominar;
        System.out.println("Your Amount is left "+mainAmtDominar+" from your DP Amount");
        double intrestAmtDominar = mainAmtDominar*intrestonDominar/100;
        double totalAmtDominar = mainAmtDominar+intrestAmtDominar;
        return totalAmtDominar; 
    }
    public static double bajajRS(double pulsarRS,double intrestonRS,double dpAmtRS){
        double mainAmtRS = pulsarRS-dpAmtRS;
        System.out.println("Your Amount is left "+mainAmtRS+" from your Dp Amount");
        double intrestAmtonRS = mainAmtRS*intrestonRS/100;
        double totalAmtRS = mainAmtRS+intrestAmtonRS;
        return totalAmtRS;
    }
    public static double tvsRTR(double apacheRTR,double intrtestonApache,double dpAmtApache){
        double mainAmtRtr = apacheRTR-dpAmtApache;
        System.out.println("Your Amount is Left "+mainAmtRtr+" from your DP Amount..");
        double intrestAmtonRTR = mainAmtRtr*intrtestonApache/100;
        double totalAmt = mainAmtRtr+intrestAmtonRTR;
        return totalAmt;
    }
    public static double tvsStarCity(double starCityAmt,double intrestonStarCity,double dpAmtStar){
        double mainAmt = starCityAmt-dpAmtStar;
        System.out.println("Your Amount is Left "+mainAmt+" from your DP Amount");
        double itrestAmtonStartCity = mainAmt*intrestonStarCity/100;
        double totalAmtStarCity = mainAmt+itrestAmtonStartCity;
        return totalAmtStarCity;
    }
    public static double tvsStarSports( double starSportsAmt, double intrestonStarSports, double dpAmtStarSports){
        double mainAmt = starSportsAmt-dpAmtStarSports;
        System.out.println("Your Amount is Left "+mainAmt+" from your DP Amount");
        double intrestAmtSports = mainAmt*intrestonStarSports/100;
        double totalAmtSports = mainAmt+intrestAmtSports;
        return totalAmtSports;
    }
    public static double tvsJive(double jiveAmt,double intrestonJive,double dpAmtJive){
        double mainAmt = jiveAmt-dpAmtJive;
        System.out.println("Your Amount is left "+mainAmt+" from your DP Amount");
        double inrestAmtonJive = mainAmt*intrestonJive/100;
        double totalAmtJive = mainAmt+inrestAmtonJive;
        return totalAmtJive;
    }
    
    public static void main(String args[]) {
        System.out.println("Welcome to Arpit ShowRoom...:");
        System.out.println("We have 4 Category of Bikes Availble here..");
        System.out.println("Press 1 for Hero, 2 for Honda, 3 for Bajaj, 4 for TVS...");
        Scanner sc = new Scanner(System.in);
        int enrty1 = sc.nextInt();

        if(enrty1 == 1){
            System.out.println("Welcome to Hero Motocorp...");
            System.out.println("Here we have some Bikes for you...");
            System.out.println("Press 1 for Spelnder+ 2 for Super Splender, 3 for Glammer, 4 for Passion");
            int entry2 = sc.nextInt();
            if(entry2 == 1){
                System.out.println("Seems Like you intrested in Splender..");
                System.out.println("We have an offer for Finance..");
                double splenderPlusAmt = 58000.60;
                double intrestOnSplender = 11;
                System.out.println("Spender Price is "+splenderPlusAmt);
                System.out.println("How much you've for DownPayment?");
                double dpAmt = sc.nextDouble();
                if(dpAmt<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtonSplender = splenderPlus(splenderPlusAmt, intrestOnSplender, dpAmt);
                System.out.println("You have to Pay Total Amout after Bank Intrtest "+totalAmtonSplender);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double EmiInMonths = totalAmtonSplender/emiEntry; 
                System.out.println("You chosse "+emiEntry+" Months Emi Plan");
                System.out.println("You've to Pay "+EmiInMonths+" Per/Months");
                
            }  
            if(entry2 == 2){
                System.out.println("Seems like you intrested in Super Splender..");
                System.out.println("We're Offering you with Our Finance service..");
                double superSplnderAmt = 67800.56;
                double intrestonSuper = 12;
                System.out.println("Super Splender Price is "+superSplnderAmt+" And Bank intrest is 12%");
                System.out.println("Enter your DP Amount");
                double dpAmtonSuper = sc.nextDouble();
                if(dpAmtonSuper<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtonSuper = superSplender(superSplnderAmt, intrestonSuper, dpAmtonSuper);
                System.out.println("You have to Pay Total Amout after Bank Intrtest "+totalAmtonSuper);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invaid Input..");
                }
                double emiinMonths = totalAmtonSuper/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            if(entry2 == 3){
                System.out.println("Seems Like you intrested in Glammer..");
                System.out.println("We have an offer for Finance..");
                double glammerAmt = 72400.60;
                double intrestonGlammer = 13;
                System.out.println("Hero Glammer price is "+glammerAmt+" And Bank intrest is 13%");
                System.out.println("Enter your DownPayment Amount..");
                double dpAmtonGlammer = sc.nextDouble();
                if(dpAmtonGlammer<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtonGlammer = glammerBike(glammerAmt, intrestonGlammer, dpAmtonGlammer);
                System.out.println("You have to Pay Amount after Bank Intrest "+totalAmtonGlammer);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtonGlammer/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            if(entry2 == 4){
                System.out.println("Seems like you're intrested in Passion Bike..");
                System.out.println("We are offring Finance Services..");
                double passionAmt = 74600.30;
                double intrestonPassion = 13.5;
                System.out.println("Hero Passion price is "+passionAmt+" And Bank Intrest is 13.5%");
                System.out.println("Enter your DownPayment Amount..");
                double dpAmtonPassion = sc.nextDouble();
                if(dpAmtonPassion<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtonPassion = passionBike(passionAmt, intrestonPassion, dpAmtonPassion);
                System.out.println("You have to Pay Amounut after Bank Intrest "+totalAmtonPassion);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtonPassion/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            else{
                System.out.println("Thanks for Visit..");
            }
        }
        if(enrty1 == 2){
            System.out.println("Welcome to Honda Motors..");
            System.out.println("Here we've some Bike and Scooters for you..");
            System.out.println("Press 1 for Shine, 2 for Livo, 3 for Dream Yuga, 4 for Activa 5G ");
            int entry3 = sc.nextInt();

            if(entry3 == 1){
                System.out.println("Seems like you're Intrested in Honda Shine..");
                System.out.println("We're Offering you Bank Finance");
                double hondaShineAmt = 76854.30;
                double intrestonShine = 12.8;
                System.out.println("Honda Shine Price is "+hondaShineAmt+" and Bank intrest on Shine is 12.8% ");
                System.out.println("Enter your DownPayment Amount");
                double dpAmtShine = sc.nextDouble();
                if(dpAmtShine<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtOnShine = shineBike(hondaShineAmt, intrestonShine, dpAmtShine);
                System.out.println("You have to Pay AMount after Bank Intrest is "+totalAmtOnShine);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtOnShine/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");

            }
            if(entry3 == 2){
                System.out.println("Seems like you're Intrested on Honda Livo..");
                System.out.println("We're Offering you Bank Finance");
                double hondaLivoAmt = 74685.63;
                double intrestonLivo = 12.8;
                System.out.println("Honda Livo price is "+hondaLivoAmt+" and Bank Intrest is 12.8%");
                System.out.println("Enter your DownPayment Amount...");
                double dpAmtonLivo = sc.nextDouble();
                if(dpAmtonLivo<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtonLivo = livoBike(hondaLivoAmt, intrestonLivo, dpAmtonLivo);
                System.out.println("You have to Pay After Bank Intrest Amount is "+totalAmtonLivo);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtonLivo/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            if(entry3 == 3){
                System.out.println("Seems like you're Intrested in Dream Yuga..");
                System.out.println("We're Offering you Bank Finance");
                double dreamYugaAmt = 72465.20;
                double intrestOnYuga = 13.4;
                System.out.println("Honda Dream Yuga price is "+dreamYugaAmt+" and Bank Intrest is 13.4%");
                System.out.println("Enter the DownPayment Amount");
                double dpAmtYuga = sc.nextDouble();
                if(dpAmtYuga<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtYuga = yugaBike(dreamYugaAmt, intrestOnYuga, dpAmtYuga);
                System.out.println("You have to Pay After Bank Intrest Amount is "+totalAmtYuga);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtYuga/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            if(entry3 == 4){
                System.out.println("Seems like you are intrested in Activa 5G Scooter..");
                System.out.println("We're Offering you Bank Finance");
                double activaAmt = 83655.30;
                double intrestonActiva = 13.6;
                System.out.println("Honda Activa price is "+activaAmt+" and Bank Intrest is 13.6%");
                System.out.println("Enter your Dp Amount");
                double dpAmtonActiva = sc.nextDouble();
                if(dpAmtonActiva<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtActiva = activaScooter(activaAmt, intrestonActiva, dpAmtonActiva);
                System.out.println("You have to Pay After Bank Intrest Amount is "+totalAmtActiva);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtActiva/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            else{
                System.out.println("Thanks for Visit...");
            }
        }
        if(enrty1 == 3){
            System.out.println("Welcome to Bajaj Motors..");
            System.out.println("Here we've some Bike for you..");
            System.out.println("Press 1 for Pulsar, 2 for CT-100, 3 for Dominar, 4 for Pulsar RS250");
            int entry4 = sc.nextInt();

            if(entry4 == 1){
                System.out.println("Seems like you're Intrested in Pulsar");
                System.out.println("We're Offering you Bank Finance..");
                double pulsarAmt = 96650.30;
                double intrestOnPulsar = 13.6;
                System.out.println("Bajaj Pulsar price is "+pulsarAmt+" and Bank Intrest is 13.6%");
                System.out.println("Enter your DownPayment Amount");
                double dpAmtonPlusar = sc.nextDouble();
                if(dpAmtonPlusar<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtPulsar = bajajPulsar(pulsarAmt, intrestOnPulsar, dpAmtonPlusar);
                System.out.println("You have to Pay after Bank Interst Amount is "+totalAmtPulsar);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtPulsar/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            if(entry4 == 2){
                System.out.println("Seems like you're Intrested in CT-100");
                System.out.println("We're Offering you Bank Finance..");
                double Ct100Amt = 68452.30;
                double intrestonCT100 = 12.65;
                System.out.println("Bajaj CT-100 Price is "+Ct100Amt+"and Bank intrest is 12.65%");
                System.out.println("Enter your DownPayment Amount..");
                double dpAmtCT100 = sc.nextDouble();
                if(dpAmtCT100<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtCT100 = bajajCT(Ct100Amt, intrestonCT100, dpAmtCT100);
                System.out.println("You have to Pay after Bank Intrest "+totalAmtCT100);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtCT100/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            if(entry4 == 3){
                System.out.println("Seems like you're Intrested in Dominar");
                System.out.println("We're Offering you Bank Finance..");
                double dominarAmt = 180000.20;
                double intrestonDominar = 14.6;
                System.out.println("Bajaj Dominar price is "+dominarAmt+" and Bank intrest is 14.6%");
                System.out.println("Enter the DownPayment Amount");
                double dpAmtDominar = sc.nextDouble();
                if(dpAmtDominar<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtDominar = bajajDominar(dominarAmt, intrestonDominar, dpAmtDominar);
                System.out.println("You've to Pay after Bank Intrest "+totalAmtDominar);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtDominar/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            if(entry4 == 4){
                System.out.println("Seems like you're Intrested in Dominar");
                System.out.println("We're Offering you Bank Finance..");
                double pulsarRS = 165000.30;
                double intrestonRS = 14.8;
                System.out.println("Bajaj Pulsae RS price is "+pulsarRS+" and Bank Intrest is 14.80%");
                System.out.println("Enter your DownPayment Amount");
                double dpAmtRS = sc.nextDouble();
                if(dpAmtRS<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtRS = bajajRS(pulsarRS, intrestonRS, dpAmtRS);
                System.out.println("You've to Pay amount after Bank Intrest is "+totalAmtRS);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtRS/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            else{
                System.out.println("Thank you Please Visit Again..");
            }
        }
        if(enrty1 == 4){
            System.out.println("Welcome to TVS Motors..");
            System.out.println("Here we've some Bike for you..");
            System.out.println("Press 1 for Apache, 2 for Star City, 3 for Start Sports, 4 for Jive");
            int entry5 = sc.nextInt();
            if(entry5 == 1){
                System.out.println("Seems like you're Intrested in Apache");
                System.out.println("We're Offering you Bank Finance..");
                double apacheRTR = 136080.90;
                double intrtestonApache = 14.2;
                System.out.println("TVS Apache bike Price is "+apacheRTR+" and Bank intrest is 14.2%");
                System.out.println("Enter the DownPayment Amount");
                double dpAmtApache = sc.nextDouble();
                if(dpAmtApache<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmt = tvsRTR(apacheRTR, intrtestonApache, dpAmtApache);
                System.out.println("You have to Pay amount after Bank Intrest is "+totalAmt);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmt/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            if(entry5 == 2){
                System.out.println("Seems like you're Intrested in Star City");
                System.out.println("We're Offering you Bank Finance..");
                double starCityAmt = 74658.25;
                double intrestonStarCity = 12.83;
                System.out.println("TVS Star City price is "+starCityAmt+" and Bank intrest is 12.83%");
                System.out.println("Enter the DownPayment Amount");
                double dpAmtStar = sc.nextDouble();
                if(dpAmtStar<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtStarCity = tvsStarCity(starCityAmt, intrestonStarCity, dpAmtStar);
                System.out.println("You have to Pay Intrest included Amount is "+totalAmtStarCity);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtStarCity/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            if(entry5 == 3){
                System.out.println("Seems like you're Intrested in Star Sports");
                System.out.println("We're Offering you Bank Finance..");
                double starSportsAmt = 67658.25;
                double intrestonStarSports = 11.83;
                System.out.println("TVS Star City price is "+starSportsAmt+" and Bank intrest is 11.83%");
                System.out.println("Enter the DownPayment Amount");
                double dpAmtStarSports = sc.nextDouble();
                if(dpAmtStarSports<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtSports = tvsStarSports(starSportsAmt, intrestonStarSports, dpAmtStarSports);
                System.out.println("You have to pay Bank Intrest Included Amount is "+totalAmtSports);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtSports/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            if( entry5 == 4){
                System.out.println("Seems like you're Intrested in Jive");
                System.out.println("We're Offering you Bank Finance..");
                double jiveAmt = 67658.25;
                double intrestonJive = 12.23;
                System.out.println("TVS Star City price is "+jiveAmt+" and Bank intrest is 12.23%");
                System.out.println("Enter the DownPayment Amount");
                double dpAmtJive = sc.nextDouble();
                if(dpAmtJive<0){
                    System.out.println("Invalid Input..");
                }
                double totalAmtJive = tvsJive(jiveAmt, intrestonJive, dpAmtJive);
                System.out.println("You have to Pay intrest included Amount is "+totalAmtJive);
                System.out.println("How many Months EMI you Choose Enter the Months..");
                double emiEntry = sc.nextDouble();
                if(emiEntry<0){
                    System.out.println("Invalid Input..");
                }
                double emiinMonths = totalAmtJive/emiEntry;
                System.out.println("You Choose "+emiEntry+" Months Emi Plan...");
                System.out.println("You've to Pay "+emiinMonths+" Per/Months..");
            }
            else{
                System.out.println("Thanks for Visits..");
            }
        }
        else{
            System.out.println("Thanks for you Visit To Us");
        }
    }
}