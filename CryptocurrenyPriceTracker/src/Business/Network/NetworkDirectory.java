/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansigandhi
 */
public class NetworkDirectory {
        List<Network> networkDirectory;

    public NetworkDirectory() {
        this.networkDirectory = new ArrayList<Network>();
    }

    public List<Network> getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(List<Network> networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

    public Network addNetwork()
    {
        Network network=new Network();
        networkDirectory.add(network);
        return network;
    }
    public void removeNetwork(Network network)
    {
        networkDirectory.remove(network);
    }
    public Network searchNetwork(String name)
    {
        for(Network a:networkDirectory)
        {
            if(a.getName().equalsIgnoreCase(name))
            {
               return a;  
            }
           
        }
        return null;
    }

    
}
