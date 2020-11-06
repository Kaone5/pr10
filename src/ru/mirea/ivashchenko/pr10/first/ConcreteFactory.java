package ru.mirea.ivashchenko.pr10.first;

public class ConcreteFactory implements ComplexAbstractFactory{

    @Override
    public Complex createComplex() {
        Complex complex = new Complex();
        complex.real = 0;
        complex.image = 0;
        return complex;
    }

    @Override
    public Complex createComplex(int real, int image) {
        Complex complex = new Complex();
        complex.real = real;
        complex.image = image;
        return complex;
    }
}
