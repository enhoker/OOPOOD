#include <iostream>
using namespace std;

struct Rectangle {
	float length;
	float width;
	float calculate_area() {
		return length * width;
	}
	Rectangle() {
		length = 1;
		width = 1;
	}
		Rectangle(float x, float y) {
		length = x;
		width = y;
	}
	
//	~Rectangle();
};

struct Square : Rectangle {
	
	Square() {
		length = 1;
		width = 1;	
	}
	Square(float x) {
		length = x;
		width = x;
	}
	
//	~Square();
};

struct Circle {
	float radius;
	Circle() {
		radius = 1;
	}
	Circle(float x) {
		radius = x;
	}
	
	float calculate_area() {
		return radius*radius*3.14;
	}
	
//	~Circle();
};

int main() {
	Rectangle A(8, 4);
	printf("%f ", A.calculate_area());
	
	Square B(7);
	printf("%f ", B.calculate_area());

	



	return 0;
}
