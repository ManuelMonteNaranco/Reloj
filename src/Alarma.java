public class Alarma {

    private int horas;

    private int minutos;


    public Alarma (){
        this.horas = 7;
        this.minutos = 0;
    }

    public void setHoraAlarma(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }
    public String getHoraAlarma (){
        return String.format("%02d:%02d",this.horas, this.minutos);
    }

}

