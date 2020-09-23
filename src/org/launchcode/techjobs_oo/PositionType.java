package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField{

    public PositionType() {
        super();
    }

    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof PositionType)) return false;
            PositionType position = (PositionType) o;
            return this.getId() == position.getId();
        }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PositionType that = (PositionType) o;
//        return getId() == that.getId();
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
    }
