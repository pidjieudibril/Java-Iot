package com.myprojet.temperature;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
/**
 * Hello world!
 *
 */
public class App 
{


    private MqttClient client;

    public App() {
        String broker = "tcp://test.mosquitto.org>:1883"; 
        String clientId = "JavaClient";
        MemoryPersistence persistence = new MemoryPersistence();

        try {
            client = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);

            client.connect(connOpts);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public static void main( String[] args )
    {
       
    }
}
