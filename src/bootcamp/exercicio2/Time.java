package bootcamp.exercicio2;

public class Time {
    private Long startTime;
    private Long endTime;

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long elapsedTime() throws Exception {
        if (this.startTime == null || this.endTime == null){
            throw new Exception("Métodos start e stop não foram chamados");
        }
        return this.endTime-this.startTime;
    }
}
