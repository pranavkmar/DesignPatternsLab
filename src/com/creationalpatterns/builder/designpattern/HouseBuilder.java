package com.builder.designpattern;

public interface HouseBuilder
{

     void buildBasement();

     void buildStructure();

     void buildRoof();

     void buildInterior();

     House getHouse();
}