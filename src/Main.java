import  java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int pil1, pil2, pil3, pil4, pil5, pil6;

        Scanner input = new Scanner(System.in);

        System.out.println("##### ARE YOU STRESSED? #####");
        System.out.println("# Aplikasi konsultasi stress #");
        System.out.println("------------------------------\n");

        System.out.println("Apakah kamu merasa kalau sedang stress?");
        System.out.println("1. Ya       2. Tidak");
        System.out.print("Jawab: ");
        pil1 = input.nextInt();

        if (pil1 == 1){
            System.out.println("Bagaimana level energimu?");
            System.out.println("1. Cukup baik       2. Rendah");
            System.out.print("Jawab: ");
            pil2 = input.nextInt();

            if (pil2 == 1){
                System.out.println("Apakah kamu merasa kacau/bingung?");
                System.out.println("1. Lumayan       2. Nggak terlalu");
                System.out.print("Jawab: ");
                pil3 = input.nextInt();

                if(pil3 == 1){
                    System.out.println("\nSOLUSI: \n   - Hidari multitasking\n   - Bersihkan sekitarmu");
                }
                else if (pil3 == 2){
                    System.out.println("Apakah kamu cukup refreshing diluar?");
                    System.out.println("1. Nggak       2. Iya, cukup");
                    System.out.print("Jawab: ");
                    pil4 = input.nextInt();

                    if (pil4 == 1){
                        System.out.println("\nSOLUSI:\n   - Coba keluar cari udara segar\n   - Dengan begitu akan membantumu fokus kembali");
                    }
                    else if (pil4 == 2){
                        System.out.println("Apakah seseorang membuatmu marah?");
                        System.out.println("1. Iya, kami baru saja berkelahi       2. Nggak, aku hanya merasa sedih");
                        System.out.print("Jawab: ");
                        pil5 = input.nextInt();

                        if (pil5 == 1){
                            System.out.println("\nSOLUSI: \n   - Coba pahami situasi\n   - Buang egomu dan minta maaflah");
                        }
                        else if (pil5 == 2){
                            System.out.println("Apakah ada seseorang yang dapat kamu ajak berbicara?");
                            System.out.println("1. Iya       2. Nggak ada");
                            System.out.print("Jawab: ");
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
                System.out.println("Apakah kamu cukup tidur?");
                System.out.println("1. Yup       2. Nggak eh");
                System.out.print("Jawab: ");
                pil3 = input.nextInt();

                if (pil3 == 1){
                    System.out.println("Apakah seseorang membuatmu marah?");
                    System.out.println("1. Iya, kami baru saja berkelahi       2. Nggak, aku hanya merasa sedih");
                    System.out.print("Jawab: ");
                    pil5 = input.nextInt();

                    if (pil5 == 1){
                        System.out.println("\nSOLUSI: \n   - Coba pahami situasi\n   - Buang egomu dan minta maaflah");
                    }
                    else if (pil5 == 2){
                        System.out.println("Apakah ada seseorang yang dapat kamu ajak berbicara?");
                        System.out.println("1. Iya       2. Nggak ada");
                        System.out.print("Jawab: ");
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
