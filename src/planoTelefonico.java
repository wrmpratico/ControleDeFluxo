public class planoTelefonico {

    public static void main(String[] args) {

        String plano = "B"; //B //M //T

        /*if (plano == "B") {
            System.out.println("PLANO BASIC: 100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("PLANO MÍDIA: 100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");

        } else if (plano == "T") {
            System.out.println("PLANO TURBO: 100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("5 GB Youtube");
        }
        */

        switch (plano) {

            case "B": {
                System.out.println("PLANO BASIC: 100 minutos de ligação");
                break;
            }

            case "M": {
                System.out.println("PLANO MÍDIA: 100 minutos de ligação");
                System.out.println("WhatsApp e Instagram grátis");
            }

            case "T": {
                System.out.println("PLANO TURBO: 100 minutos de ligação");
                System.out.println("WhatsApp e Instagram grátis");
                System.out.println("5 GB Youtube");
            }

        }

    }
}

