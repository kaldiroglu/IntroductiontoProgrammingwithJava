void main() {
    int fortune = (int)(Math.random() * 5);
    String message = switch (fortune) {
        case 0 -> "🔮 Your code will compile on the first try!";
        case 1 -> "🌟 A bug you fix today will save you hours tomorrow";
        case 2 -> "💡 The answer is in the error message";
        case 3 -> "🎯 Your next project will be amazing";
        default -> "☕ Coffee is the secret to good code";
    };
    System.out.println("Your programming fortune: " + message);
}