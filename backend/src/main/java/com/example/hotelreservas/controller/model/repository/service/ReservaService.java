package com.example.hotelreservas.service;

import com.example.hotelreservas.model.Reserva;
import com.example.hotelreservas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva registrarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    public Optional<Reserva> actualizarReserva(Long id, Reserva nuevaReserva) {
        return reservaRepository.findById(id).map(reserva -> {
            reserva.setFechaInicio(nuevaReserva.getFechaInicio());
            reserva.setFechaFin(nuevaReserva.getFechaFin());
            return reservaRepository.save(reserva);
        });
    }

    public void cancelarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}
