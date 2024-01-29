package oopConcepte;

import java.util.List;

public class FabricaBMW extends FabricaMasina {

        private Integer pretStandard;
        private Integer pretFinal;
        private List<String> dotariExterioare;
        private List<String > dotariInterioare;


        public FabricaBMW( String model, String sasiu, String culoare, Integer motorizare,
                            List<String>dotariExterioare, List<String>dotariInterioare) {
            super("BMW", model, sasiu, culoare, motorizare);

            this.dotariExterioare = dotariExterioare;
            this.dotariInterioare = dotariInterioare;
        }

        public void prezantareBMW(){

            prezentareMasina();
            definirePretModel();
            pretFinal= pretStandard + calculDotariInterioare() +calculDotariExterioare();

            System.out.println("pretul standard este" + pretStandard);
            System.out.println("pretul final este " + pretFinal);


        }

        public void definirePretModel(){

            switch (getModel()){
                case "x6":
                    pretStandard = 40000;
                    break;
                case "x1":
                    pretStandard = 80000;
                    break;
                default:
                    System.out.println("Nu mai avem pe stoc acest model");


            }
        }

        public Integer calculDotariExterioare(){
            Integer pretDotari = 0;
            for (Integer i = 0; i<dotariExterioare.size(); i++) {
                switch (dotariExterioare.get(i)) {
                    case "jante":
                        pretDotari = pretDotari + 500;
                        break;
                    case "trapa":
                        pretDotari = pretDotari + 900;
                        break;
                    case "faruri":
                        pretDotari = pretDotari + 1200;
                        break;
                    case "spoiler":
                        pretDotari = pretDotari + 650;
                        break;
                    case "oglinzi electrice":
                        pretDotari = pretDotari + 2000;
                        break;

                }
            }
            return pretDotari;
        }
            public Integer calculDotariInterioare(){
                Integer pretDotari = 0;
                for (Integer i = 0; i<dotariInterioare.size(); i++) {
                    switch (dotariInterioare.get(i)){
                        case "incalzire scaune" :
                            pretDotari = pretDotari + 500;
                            break;
                        case"clima":
                            pretDotari= pretDotari + 900;
                            break;
                        case  "stopuri":
                            pretDotari = pretDotari + 1200;
                            break;
                        case  "tetiera":
                            pretDotari = pretDotari + 650;
                            break;
                        case "oglinzi electrice" :
                            pretDotari= pretDotari + 2000;
                            break;

                    }
                }
                return pretDotari;
            }

    public Integer getPretStandard() {
        return pretStandard;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }


    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }

    public void AngajariFirma(){
        System.out.println("Nu sunt posturi pentru angajare la fabrica BMW");
        super.AngajariFirma();
    }
}




