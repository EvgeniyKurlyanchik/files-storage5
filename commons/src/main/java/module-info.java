module ru.gb {
    requires org.slf4j;
    requires lombok;
    requires java.logging;
    opens ru.gb.commons.Actions;
    opens ru.gb.commons.File;
    opens ru.gb.commons.utils;
    exports ru.gb.commons.File;
    exports ru.gb.commons.Actions;
    exports ru.gb.commons;
    exports ru.gb.commons.utils;

}