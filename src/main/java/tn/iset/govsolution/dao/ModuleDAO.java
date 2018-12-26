package tn.iset.govsolution.dao;

import java.util.List;

import tn.iset.govsolution.entity.Module;

public interface ModuleDAO {
	
	public Module addModule(Module Module);
	public Module updateModule(Module Module);
	public void deleteModule(long ModuleId);
	public Module getModule(long ModuleId);
	public List<Module> getModules();

}
