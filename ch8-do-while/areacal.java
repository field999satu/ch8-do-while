void main() {
    int width = 4;
    int height = 3;
    int area = 0;
    area = areacal(width, height);
    IO.print("Rectang area :" + area);
}

int areacal(int w, int h) {
    return w * h;
}

int areacalpara(int w, int h) {
    return (2 * w) + (2 * h);
}

int areacalpara(int b) {
    return (1 / 2) * b;
}