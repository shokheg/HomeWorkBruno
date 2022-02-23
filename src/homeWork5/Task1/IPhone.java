package homeWork5.Task1;

import java.util.Objects;

public class IPhone {
    private String phoneModel;
    private int phoneWeight;
    private int simQuantity;
    private int phoneWidth;
    private int phoneHeight;
    private int phoneMaterial;

    @Override
    public String toString() {
        return "Характеристики модели" +
                "Модель: " + phoneModel + '\'' +
                ", вес: " + phoneWeight +
                ", количество СИМ: " + simQuantity +
                ", ширина: " + phoneWidth +
                ", высота: " + phoneHeight +
                ", материал" + phoneMaterial +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IPhone iPhone = (IPhone) o;
        return simQuantity == iPhone.simQuantity && phoneWidth == iPhone.phoneWidth && phoneHeight == iPhone.phoneHeight && phoneMaterial == iPhone.phoneMaterial && phoneModel.equals(iPhone.phoneModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneModel, simQuantity, phoneWidth, phoneHeight, phoneMaterial);
    }
}
