package core.basesyntax;

public class Main {
    public static void main(String[] Args) {
        FigureSupplier figure = new FigureSupplier();

        Figure[] figures = new Figure[5];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figure.getRandomFigure(ColorSupplier.getRandomColor());
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figure.getDefaultFigure(ColorSupplier.getRandomColor());
        }

        for (Figure fig : figures) {
            fig.draw();
        }
    }
}
