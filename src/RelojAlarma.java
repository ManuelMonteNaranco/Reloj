public class RelojAlarma {
    private VisorReloj reloj;

    private Alarma alarma;


    public RelojAlarma(int horas, int minutos) {
        this.reloj = new VisorReloj(horas, minutos);
        this.alarma = new Alarma();
    }

    public RelojAlarma() {
        this.reloj = new VisorReloj();
        this.alarma = new Alarma();
    }


    public void emitirTic() {
        this.reloj.emitirTic();
        if (esHoraAlarma() == true) {
            System.out.println("RRRRRRRRRRRIIIIIIIIIIIINNNNNNNNNNNNNNNGGGGGG");
        }
    }

    public boolean esHoraAlarma() {
        if (this.reloj.getHora() != this.alarma.getHoraAlarma()) {
            return false;
        }
        return true;
    }

    public void Alarma(int nuevaHora, int nuevoMinuto) {
        this.alarma.getHoraAlarma();
    }

    public String gethora() {
        return "La hora actual es " + this.reloj.getHora();
    }
public String getAlarma(){
        return "La alarma ahora vale: " + this.alarma.getHoraAlarma();
}
}
