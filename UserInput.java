//Creating method handleOperations
  public void handleOperation(int choice, Calculator calculator) {
  
    switch (choice) {
      case 1 -> {
        System.out.println("Enter two numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Result: " + calculator.add(a, b));
      }
        
    }
  }
}
