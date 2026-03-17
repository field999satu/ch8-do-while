# My Java Project

นี่คือแผนภาพ Class Diagram ของโปรเจกต์นี้:

```mermaid
classDiagram
    class AreaCalculator {
        +main(args: String[]) void
    }

    class Rectangle {
        -int width
        -int height
        +Rectangle()
        +Rectangle(int width)
        +setwidth(int width) void
        +setheight(int height) void
        +calculateArea() int
        +calculatePerimeter(int width, int height) int
    }

    AreaCalculator ..> Rectangle : "creates and uses"
