package sealed.interfaces;

sealed public interface TrafficLight permits RedLight, YellowLight, GreenLight {
}
