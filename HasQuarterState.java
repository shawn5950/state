package com.j2.state.gumball;

import java.util.Random;

public class HasQuarterState implements State {
 Random randomWinner = new Random(System.currentTimeMillis());
 GumballMachine gumballMachine;
 
 public HasQuarterState(GumballMachine gumballMachine) {
  this.gumballMachine = gumballMachine;
 }
  
 public void insertQuarter() {
  System.out.println("You can't insert another quarter");
  int wrong = randomWinner.nextInt(20);
  if((wrong == 0) && (gumballMachine.getCount()>1)) {
    gumballMachine.setState(gumballMachine.getWrongState());
  } else {
    gumballMachine.setState(gumballMachine.getSoldState());
  }
 }
 
 
 public void ejectQuarter() {
  System.out.println("Quarter returned");
  gumballMachine.setState(gumballMachine.getNoQuarterState());
 }
 
 public void turnCrank() {
  System.out.println("You turned...");
  int winner = randomWinner.nextInt(10);
  if ((winner == 0) && (gumballMachine.getCount() > 1)) {
   gumballMachine.setState(gumballMachine.getWinnerState());
  } else {
   gumballMachine.setState(gumballMachine.getSoldState());
  }
 }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
 public String toString() {
  return "waiting for turn of crank";
 }
}