package ucu.apps.demo.decorators;

import ucu.apps.demo.flower.Item;

abstract class AbstractDecorator extends Item {
    abstract public String getDescription();
}
