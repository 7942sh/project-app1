/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.app1;

public class App {


  public static void main(String[] args) {
    Console console = new Console();

    while (true) {
      Command command = console.prompt();
      CommandHandler commandHandler = new CommandHandler();
      if (command.getName().equals("quit") || command.getName().equals("exit")) {
        break;

      } else if (command.getName().equals("")) {
        continue;

      } else if (command.getName().equals("help")) {
        commandHandler.doHelp();

      } else if (command.getName().equals("add")) {
        commandHandler.doAdd(command);

      } else if (command.getName().equals("minus")) {
        commandHandler.doMinus(command);

      } else {
        System.out.println("지원하지 않는 연산자입니다.");
      }
    }

    console.close();

  }



}