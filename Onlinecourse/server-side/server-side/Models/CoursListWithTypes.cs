﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace server_side.Models
{
    public class CoursListWithTypes
    {
        public string Name { get; set; }
        public string Subtitle { get; set; }
        public string Description { get; set; }
        public List<Courses> Courses { get; set; }
    }
}
