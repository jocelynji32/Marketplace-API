package com.intuit.cg.backendtechassessment.model;
import com.intuit.cg.backendtechassessment.model.shared.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Buyers")
public class Buyer extends User {
}