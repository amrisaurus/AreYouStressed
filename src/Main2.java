import  java.util.Scanner;

public class Main2 {
    public static void main(String [] args){
        int pil1, pil2, pil3, pil4, pil5, pil6;

        Scanner input = new Scanner(System.in);
        Function pilih = new Function();

        System.out.println("##### ARE YOU STRESSED? #####");
        System.out.println("# Aplikasi konsultasi stress #");
        System.out.println("------------------------------\n");

        pilih.Stressed();
        pil1 = input.nextInt();

        if (pil1 == 1){
            pilih.Energy();
            pil2 = input.nextInt();

            if (pil2 == 1){
                pilih.Disorganized();
                pil3 = input.nextInt();

                if(pil3 == 1){
                    System.out.println("\nSOLUSI: \n   - Hidari multitasking\n   - Bersihkan sekitarmu");
                } else if (pil3 == 2){
                    pilih.Refreshed();
                    pil4 = input.nextInt();

                    if (pil4 == 1){
                        System.out.println("\nSOLUSI:\n   - Coba keluar cari udara segar\n   - Dengan begitu akan membantumu fokus kembali");
                    } else if (pil4 == 2){
                        pilih.Angry();
                        pil5 = input.nextInt();

                        if (pil5 == 1){
                            System.out.println("\nSOLUSI: \n   - Coba pahami situasi\n   - Buang egomu dan minta maaflah");
                        }
                        else if (pil5 == 2){
                            pilih.SomeoneTalkingTo();
                            pil6 = input.nextInt();

                            if (pil6 == 1){
                                System.out.println("\nSOLUSI: \n   - Curhat ke temenmu\n   - Kamu akan merasa len=bih baik");
                            }
                            else if (pil6 == 2){
                                System.out.println("\nSOLUSI: \n   - Datangi psikiater dan ceritakan masalahmu");
                            }
                        } //SomeoneTalkTo
                    } //SomeoneMadeUAngry
                } //Refreshing
            } // Disorganized


            else if (pil2 == 2){
                pilih.Sleep();
                pil3 = input.nextInt();

                if (pil3 == 1){
                    pilih.Angry();
                    pil5 = input.nextInt();

                    if (pil5 == 1){
                        System.out.println("\nSOLUSI: \n   - Coba pahami situasi\n   - Buang egomu dan minta maaflah");
                    }
                    else if (pil5 == 2){
                        pilih.SomeoneTalkingTo();
                        pil6 = input.nextInt();

                        if (pil6 == 1){
                            System.out.println("\nSOLUSI: \n   - Curhat ke temenmu\n   - Kamu akan merasa lebih baik");
                        }
                        else if (pil6 == 2){
                            System.out.println("\nSOLUSI: \n   - Datangi psikiater dan ceritakan masalahmu");
                        }
                    } //SomeoneTalkTo
                }
                else if (pil3 == 2){
                    System.out.println("SOLUSI: \n   - Cobalah meditasi\n   - Atur pola tidurmu secara rutin");
                }
            }
        }
        else if (pil1 == 2){
            System.out.println("Yaudah, kamu baik-baik saja\nJaga kondisimu");
        }
    }
}
