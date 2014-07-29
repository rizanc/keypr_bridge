package com.keypr.pms.micros.oxi.ids;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public abstract class TypedIdentifier<T> {
    private T identifier;

    protected TypedIdentifier(T identifier) {
        this.identifier = identifier;
    }

    public T getIdentifier() {
        return identifier;
    }

    public void setIdentifier(T identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypedIdentifier that = (TypedIdentifier) o;

        if (identifier != null ? !identifier.equals(that.identifier) : that.identifier != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return identifier != null ? identifier.hashCode() : 0;
    }
}
