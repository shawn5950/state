package com.j2.state.gumball;

public class WrongState implements State {
    GumballMachine gumballMachine;
 
    public WrongState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
 public void insertQuarter() {
  System.out.println("You insert a quarter...");
 }
 
 public void ejectQuarter() {
  System.out.println("You can't eject, The machine has something problem. Call manager");
 }
 
 public void turnCrank() {
  System.out.println("The machine has problem, call manager");
 }
 
 public void dispense() {
  System.out.println("No gumball dispensed");
 }
 
 public String toString() {
  return "The machine has problem";
 }
}