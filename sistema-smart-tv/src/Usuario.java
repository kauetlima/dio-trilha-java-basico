public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada ? : " + smartTV.ligada);
        System.out.println("Canal Atual ? : " +smartTV.canal);
        System.out.println("Volume Atual ? : " +smartTV.volume);

        smartTV.ligar();
        System.out.println("TV ligada ? : " + smartTV.ligada);
        
        smartTV.desligar();
        System.out.println("TV ligada ? : " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.mudarCanal(13);

        System.out.println("Canal atual: " + smartTV.canal);


        
}
}