package ww3.ntu.classes01.dominio;

public class TheTime {
    private int hour;
    private int minute;
    private int seconds;

    public TheTime(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.seconds= second;
    }

    public  TheTime nextSecond(){
        if (this.seconds==59){
                if (this.minute==59){
                    if (this.hour==23){
                        setTime(0,0,0);
                    }else {
                        setTime(this.hour + 1, 0, 0);
                    }
                }else{
                    setTime(this.hour,this.minute+1,0);
                }

        }else {
            setSeconds(this.seconds+1);
        }
        return this;
    }

    public TheTime previousSeconds(){
        if (this.seconds==00){
            if (this.minute==00){
                if (this.hour==00){
                    setTime(23,59,59);
                }else {
                    setTime(this.hour -1 ,59, 59);
                }
            }else{
                setTime(this.hour,this.minute-1,59);
            }

        }else {
            setSeconds(this.seconds-1);
        }


        return this;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }


    @Override
    public String toString() {
        return String.format("%02d",this.hour) + ":"+
                String.format("%02d", this.minute) + ":"+
                String.format("%02d",this.seconds);

    }
}
