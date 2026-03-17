void main() {
    double[] scores = { 85.5, 92.0, 78.5 };
    for (int i = 0; i < scores.length; i++) {
        IO.println(scores[i]);
    }

    double[] points = { 85.5, 92.0, 78.5 };
    for (double point : points) {
        IO.println(point);
    }
}