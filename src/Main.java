import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float f[];
        f = new float[10];
        float trenutnavisina;
        Scanner myObj = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Unesite visinu:");
            trenutnavisina = myObj.nextFloat();
            f[i] = trenutnavisina;
        }
        float najnizavisina = f[0];
        float najvisavisina = f[0];
        float suma = 0;
        int iznadprosjecni = 0;
        int niziod175 = 0;
        for (int i=0;  i<10; i++) {
            if (najnizavisina > f[i]){
                najnizavisina = f[i];

            }
        }
        for (int i=0;  i<10; i++) {
            if (najvisavisina < f[i]){
                najvisavisina = f[i];

            }
        }
        for (int i=0;  i<10; i++){
            suma = suma + f[i];
        }
        float prosjek =  suma / 10;
        for (int i=0;  i<10; i++) {
            if (f[i] > prosjek){
                iznadprosjecni++;
            }
        }
        for (int i=0;  i<10; i++) {
            if (f[i] < 1.75){
                niziod175++;
            }
        }
        System.out.println("Prosječna visina:" + prosjek);
        System.out.println("Najniža visina:" + najnizavisina);
        System.out.println("Najviša visina:" + najvisavisina);
        System.out.println("Broj studenata iznad prosjeka:" +iznadprosjecni);
        System.out.println("Broj studenata ispod 1.75m:" + niziod175);

    }
    }