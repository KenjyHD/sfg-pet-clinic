package kenjy.sfgpetclinic.services.springdatajpa;

import kenjy.sfgpetclinic.model.Specialty;
import kenjy.sfgpetclinic.repositories.SpecialtyRepository;
import kenjy.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {
    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialtys = new HashSet<>();
        specialtyRepository.findAll().forEach(specialtys::add);
        return specialtys;
    }

    @Override
    public void deleteById(Long id) {
        specialtyRepository.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return specialtyRepository.findById(id).orElse(null);
    }
}
