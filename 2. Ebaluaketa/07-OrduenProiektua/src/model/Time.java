/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author olivas.hodei
 */
public class Time {

    public int hour;

    public int minute;

    public int second;

    public Time(int second, int minute, int hour) {

        this.second = second;
        this.minute = minute;
        this.hour = hour;

    }

    public Time(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);

    }

    public Time nextSecond() {

        this.second = this.second + 1;

        if (this.second > 59) {

            this.second = 0;

            this.minute++;

            if (this.minute > 59) {

                this.minute = 0;

                this.hour++;

                if (this.hour > 23) {

                    this.second = 0;

                    this.minute = 0;

                    this.hour = 0;

                }

            }

        }

        return this;
    }

}
