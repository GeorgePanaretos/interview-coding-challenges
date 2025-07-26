<h1>Category</h1>
	<div class="table-header">
		<table cellpadding="0" cellspacing="0" border="0">
			<thead>
				<th>Name</th>
				<th>Category</th>
				<th>Address</th>
				<th>Distance</th>
			</thead>
		</table>
	</div>
<div class="table-content">
	<table cellpadding="0" cellspacing="0" border="0">
		<tbody>

			<?php
				require './controller/foursquare.php';
				$counter = 0;
				foreach ($foursquare->response->venues as $items) {
					if($count < 7){
						echo "<tr>";
						echo "<td>{$items->name}</td>";
						echo "<td>{$items->location->address}</td>";
						echo "<td>{$items->location->address}</td>";
						echo "<td>{$items->location->distance}</td>";
						echo "</tr>";
						$counter++;
					}
				}
			?>

		</tbody>
	</table>
</div>
